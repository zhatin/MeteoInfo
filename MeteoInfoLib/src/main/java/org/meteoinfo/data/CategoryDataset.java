/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteoinfo.data;

/**
 *
 * @author wyq
 */
public class CategoryDataset extends Dataset{

    @Override
    public DatasetType getDatasetType() {
        return DatasetType.CATEGORY;
    }
    
}
