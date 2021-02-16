package com.epam.laboratory;

import com.epam.laboratory.exceptions.IncorrectFileNameException;
import com.epam.laboratory.exceptions.IncorrectPathException;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class FileManagerTest {

    private final List<File> FILES_IN_FOLDER = new ArrayList<>();
    private final String PATH = "E:\\Works\\EpamLaboratory\\SearchDocumentInFileSystem\\AwesomeProgram.java";
    private final File FILE = new File(PATH);
    private final String INCORRECT_FILE_NAME = "Programm.gawa";
    // создаём экземпляр-заглушку для класса FileManager
    FileManager fileManager = mock(FileManager.class);


    @Test
    public void testGetDirectory() throws IncorrectFileNameException {
        // вызывая метод fileManager.getDirectoryContainingFile(new File(anyString()))) говорим: "Верни FILES_IN_FOLDER"
        when(fileManager.getDirectoryContainingFile(new File(anyString()))).thenReturn(FILES_IN_FOLDER);
        // проверяем действительно ли тот метод возвращает FILES_IN_FOLDER
        Assert.assertEquals(FILES_IN_FOLDER, fileManager.getDirectoryContainingFile(new File(anyString())));
    }

    @Test
    public void testFindFileByName() throws IncorrectFileNameException, IncorrectPathException {
        when(fileManager.getFile(anyString())).thenReturn(FILE);
        Assert.assertEquals(FILE, fileManager.getFile(anyString()));
    }

    @Test
    public void testGetFullPath() throws IncorrectFileNameException, IncorrectPathException {
        when(fileManager.getPathForFile(anyString())).thenReturn(PATH);
        Assert.assertEquals(PATH, fileManager.getPathForFile(anyString()));
    }

    @Test
    public void testSetActualDirectory() throws IncorrectFileNameException, IncorrectPathException {
        fileManager.setActualDirectory(PATH);
        when(fileManager.getPathForFile(anyString())).thenReturn(PATH);
        Assert.assertEquals(PATH, fileManager.getPathForFile(anyString()));
    }

    @Test(expected = IncorrectPathException.class)
    public void testIncorrectPathForFile() throws IncorrectPathException, IncorrectFileNameException {
        when(fileManager.getFile(anyString())).thenThrow(IncorrectPathException.class);
        fileManager.getFile(INCORRECT_FILE_NAME);
    }

    @Test(expected = IncorrectFileNameException.class)
    public void testIncorrectFileName() throws IncorrectFileNameException, IncorrectPathException {
        when(fileManager.getFile(anyString())).thenThrow(IncorrectFileNameException.class);
        fileManager.getFile(INCORRECT_FILE_NAME);
    }


}
