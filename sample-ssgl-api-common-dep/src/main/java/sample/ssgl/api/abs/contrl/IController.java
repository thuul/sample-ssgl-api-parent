/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ssgl.api.abs.contrl;

/**
 *
 * @author walles
 * @param <R>
 * @param <T>
 */
public interface IController<R, T> {

    /**
     *
     * @param entity
     * @return {@link R}
     */
    R response(T entity);
}
