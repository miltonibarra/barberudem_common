package co.com.barberudem.DAO;

import co.com.barberudem.model.LugarDTO;


/**
 * Interface que contiene los servicios asociados a la tabla lugares
 * @author Milton
 */
public interface LugarDAO {

  /**
   * Obtiene un lugar dado el id
   * @param lugarId
   * @return Lugar {@link Lugar}
   */
  public LugarDTO findLugarByID(int lugarId);
}
