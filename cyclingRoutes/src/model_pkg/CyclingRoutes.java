/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.FrameRegister;

/**
 *
 * @author Ricardo
 */
public class CyclingRoutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion inst_conect = new Conexion();
        FrameRegister inst_frame = new FrameRegister();
        inst_conect.getConnection();
        inst_frame.setVisible(true);
    }
    
}
