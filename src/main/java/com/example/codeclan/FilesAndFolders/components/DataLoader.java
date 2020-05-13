package com.example.codeclan.FilesAndFolders.components;
import com.example.codeclan.FilesAndFolders.models.File;
import com.example.codeclan.FilesAndFolders.models.Folder;
import com.example.codeclan.FilesAndFolders.models.User;
import com.example.codeclan.FilesAndFolders.repositories.FileRepository;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import com.example.codeclan.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private UserRepository userRepository;

    public void run(ApplicationArguments args) {
        User jeremy = new User("Jeremy");
        Folder folder = new Folder("TwilightFanFiction", jeremy);
        File file = new File("Robert Pattinson is a Ghost instead of Vampire", ".txt", 25, folder);
        userRepository.save(jeremy);
        folderRepository.save(folder);
        fileRepository.save(file);
    }
}
