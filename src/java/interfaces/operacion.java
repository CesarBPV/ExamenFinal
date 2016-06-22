/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 * @param <entidad>
 */
public interface operacion <entidad> {
    public int create(entidad e);
    public int update(entidad e);
    public int delete(Object key);
    public List<entidad> readAll();
    public List<entidad> read(Object key);
}
