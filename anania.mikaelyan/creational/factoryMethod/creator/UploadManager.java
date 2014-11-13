package com.synisys.training.patterns.factoryMethod.creator;

import com.synisys.training.patterns.factoryMethod.product.Document;
import com.synisys.training.patterns.factoryMethod.product.File;
import com.synisys.training.patterns.factoryMethod.product.Image;

/**
 * Creator class for "Parameterized" factory method implementation without concrete creators.
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class UploadManager {
    /**
     * Factory Method implementation
     */
    public File getFile(String fileType){
        if(fileType == null){
            throw new IllegalArgumentException("File type can not be null");
        }
        if(fileType.equals("Image")){
            return new Image();
        }
        if(fileType.equals("Document")){
            return new Document();
        }
        throw new IllegalArgumentException("File type must be either Image or Document");
    }
}
