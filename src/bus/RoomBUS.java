/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bus;

import dao.RoomDAO;
import dto.RoomDTO;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class RoomBUS {
    
    @SuppressWarnings("FieldMayBeFinal")
    private RoomDAO roomDAO;
    
    public RoomBUS(){
        roomDAO = new RoomDAO();
    }
    
    public long findIdByCode(String roomCode){
        return roomDAO.findByCode(roomCode).getId();
    }
    
    public RoomDTO findById(long id){
        return roomDAO.findById(id);
    }
    
    public ArrayList<RoomDTO> findAll(){
        return roomDAO.findAll();
    }
}
