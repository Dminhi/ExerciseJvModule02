package ra.bussiness.service.implement;

import ra.bussiness.model.Author;
import ra.bussiness.service.IAuthorService;
import ra.bussiness.util.IOFile;

import java.util.ArrayList;
import java.util.List;

public class AuthorServiceimpl implements IAuthorService {
   static List<Author> authorList = new ArrayList<>();

    public AuthorServiceimpl() {
        authorList = IOFile.readFromFile(IOFile.AUTHOR_PATH);
    }


    @Override
    public List<Author> displayAll() {

        return authorList;
    }

    @Override
    public Author findById(String id) {
        return authorList.stream().filter(e->e.getIdAuthor().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void updateById(Author author) {
    if(findById(author.getIdAuthor())==null){
        // Thêm mới
        authorList.add(author);
    }
    else {
        // Cập nhật
        authorList.set(authorList.indexOf(findById(author.getIdAuthor())),author);
    }
        IOFile.writeToFile(IOFile.AUTHOR_PATH,authorList);
    }

    @Override
    public void deleteById(String id) {
    authorList.remove(findById(id));
    IOFile.writeToFile(IOFile.AUTHOR_PATH,authorList);
    }
}
