package personal.model.file;

import personal.model.UserMapperNext;

public class RepositoryFileNext extends RepositoryFile {

    private UserMapperNext mapper = new UserMapperNext();  

    public RepositoryFileNext(FileOperation fileOperation) {
        super(fileOperation);
        super.mapper = mapper;
    }

}
