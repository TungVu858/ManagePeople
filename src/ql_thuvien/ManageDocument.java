package ql_thuvien;

import java.util.ArrayList;
import java.util.List;

public class ManageDocument implements Manage<Document> {
    List<Document> documentList = new ArrayList<>();

    @Override
    public void add(Document document) {
        documentList.add(document);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < documentList.size(); i++) {
            if (id == documentList.get(i).getDocumentID()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int id) {
        if (findById(id) != -1) {
            documentList.remove(findById(id));
        } else System.out.println("Không tìm thấy ");
    }

    @Override
    public void display() {
        boolean check = false;
        for (int i = 0; i < documentList.size(); i++) {
            System.out.println(documentList.get(i));
            check = true;
        }
        if (!check) System.out.println("Chưa có danh sách");
    }

    public void findByBook() {
        boolean check = false;
        for (int i = 0; i < documentList.size(); i++) {
            if (documentList.get(i) instanceof Book) {
                System.out.println("Các sách là : "+documentList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Chưa có sách ");
        }
    }
    public void findByJouranl() {
        boolean check = false;
        for (int i = 0; i < documentList.size(); i++) {
            if (documentList.get(i) instanceof Journal) {
                System.out.println("Các tạp trí là : "+documentList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Chưa có tạp trí ");
        }
    }
    public void findByNewpaper() {
        boolean check = false;
        for (int i = 0; i < documentList.size(); i++) {
            if (documentList.get(i) instanceof Newspaper) {
                System.out.println("Các báo là : "+documentList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Chưa có báo ");
        }
    }
}
