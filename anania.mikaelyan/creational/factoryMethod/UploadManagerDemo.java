package com.synisys.training.patterns.factoryMethod;

import com.synisys.training.patterns.factoryMethod.creator.UploadManager;

/**
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class UploadManagerDemo {
    public static void main(String[] args) {
       UploadManager uploadManager = new UploadManager();
       System.out.println(uploadManager.getFile("Image").getAvailableTypes());
       System.out.println(uploadManager.getFile("Document").getAvailableTypes());
       System.out.println(uploadManager.getFile("WrongType").getAvailableTypes());
    }
}
