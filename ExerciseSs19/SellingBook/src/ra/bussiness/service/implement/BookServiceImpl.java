package ra.bussiness.service.implement;

import ra.bussiness.model.Book;
import ra.bussiness.service.IBookService;
import ra.bussiness.util.IOFile;

import java.util.List;

public class BookServiceImpl implements IBookService {
    private static List<Book> bookList;

    public BookServiceImpl() {
        bookList = IOFile.readFromFile(IOFile.BOOK_PATH);
    }

    @Override
    public List<Book> displayAll() {
        return bookList;
    }

    @Override
    public Book findById(String id) {
        return bookList.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void updateById(Book book) {
        if (findById(book.getId()) != null) {
            // Cập nhật
            bookList.set(bookList.indexOf(findById(book.getId())),book );
        } else {
            // Thêm mới
            bookList.add(book);
        }
        IOFile.writeToFile(IOFile.BOOK_PATH,bookList);
    }

    @Override
    public void deleteById(String id) {
        bookList.remove(findById(id));
        IOFile.writeToFile(IOFile.BOOK_PATH,bookList);
    }
}
