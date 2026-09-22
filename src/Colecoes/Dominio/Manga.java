package Colecoes.Dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private long ID;
    private String nome;
    private int quantidade;

    public Manga(long ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public Manga(long ID, String nome, int quantidade) {
        this.ID = ID;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return ID == manga.ID && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Manga outroManga) {
        if (this.ID > outroManga.ID) return 1;
        if (this.ID < outroManga.ID) return -1;
        return 0;
    }
}
