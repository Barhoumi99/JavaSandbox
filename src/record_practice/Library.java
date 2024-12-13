package record_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Book> books;
    List<Member> members;

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        if (this.books.contains(book)) {
            this.books.remove(book);
        } else {
            System.out.println("Book not found!");
        }
    }

    public void listBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public void addMember(Member member) {
        if (!this.members.contains(member)) {
            this.members.add(member);
        } else {
            System.out.println("Member already exists!");
        }
    }

    public void removeMember(Member member) {
        if (this.members.contains(member)) {
            this.members.remove(member);
        } else {
            System.out.println("Member not found!");
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public List<Book> findBooksByGenre(Genre genre) {
        return this
                .books
                .stream()
                .filter(book -> book.genre() == genre)
                .collect(Collectors.toList());
    }
    public void upgradeMembership(Member member, MembershipLevel newLevel) {
        int index = this.members.indexOf(member);
        members.set(index, new Member(member.name(), member.age(), newLevel));
    }
}
