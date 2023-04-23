/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04_da;

/**
 *
 * @author emili
 */
public class Programa04_DA { //DAO  PATRON DE ACCESO A DATOS

    public static void main(String[] args) {
          //Create
        DAOEmpleado dao=new DAOEmpleado();
//        Empleado emp= new Empleado();
//        emp.setClave(3);
//        emp.setNombre("emi");
//        emp.setDireccion("Avenida 10");
//        emp.setTelefono("1122");
//        dao.create(emp);
//        Empleado em=dao.create(emp);
//        System.out.println(em.getNombre());
//
//        //Delete
//        dao.delete(2);
//        
        //Update
//        Empleado p=new Empleado();
//        p.setNombre("aaron");
//        p.setDireccion("Calle 3");
//        p.setTelefono("2321");
//        Empleado em=dao.update(1, p);
//        System.out.println(em.getNombre());
//        
        //FindALl
//        dao.findAll();
//        
        //Find by Id
        //dao.findById(3);
        Empleado em=dao.findById(3);
        System.out.println(em.getNombre());
    }
    }

