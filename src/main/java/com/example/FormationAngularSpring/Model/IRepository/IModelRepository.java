/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.FormationAngularSpring.Model.IRepository;

import com.example.FormationAngularSpring.Model.Entities.Brand;
import com.example.FormationAngularSpring.Model.Entities.Category;
import com.example.FormationAngularSpring.Model.Entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IModelRepository extends JpaRepository<Model, Integer>{
    //@Query("SELECT m from Model m where m.id_brand=:id_brand")
    //public List<Model> findByBrand(@Param("id_brand") String id_brand);
    public List<Model> getModelsByName(String name);
}
