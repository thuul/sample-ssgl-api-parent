/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.crud.dao;

import org.springframework.data.repository.CrudRepository;
import sample.ssgl.api.crud.entity.AppSetting;

/**
 *
 * @author walles
 */
public interface AppSettingRepository extends CrudRepository<AppSetting, Integer>{
}
