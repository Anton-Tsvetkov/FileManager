package com.epam.laboratory;

import com.epam.laboratory.exceptions.IncorrectFileNameException;
import com.epam.laboratory.exceptions.IncorrectPathException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private String actualDirectory;
    private List<File> filesFromActualDirectory;

    public List<File> setFilesFromActualDirectory() {
        // add all files from actualDirectory in filesFromActualDirectory list
        return new ArrayList<>();
    }

    public void setActualDirectory(String actualDirectory) {
        this.actualDirectory = actualDirectory;
        filesFromActualDirectory = setFilesFromActualDirectory();
    }

    public FileManager(String actualDirectory) {
        this.actualDirectory = actualDirectory;
    }

    String getPathForFile(String fileName) throws IncorrectFileNameException, IncorrectPathException {
        return actualDirectory;
    }

    File getFile(String fileName) throws IncorrectFileNameException, IncorrectPathException {
        // search file by name in actualDirectory
        String path = actualDirectory + "//" + fileName;
        return new File(path);
    }

    List<File> getDirectoryContainingFile(File file) throws IncorrectFileNameException {
        // return all files from actualDirectory
        return filesFromActualDirectory;
    }


}
