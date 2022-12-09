package com.example.facade;

import com.example.Department;
import com.example.subsystem.Incidents;
import com.example.subsystem.Sales;
import com.example.subsystem.Warehouse;

public class CallCenter {
  private Department sales;
  private Department warehouse;
  private Department incidents;

  public void getSalesDepartment(){
    sales = new Sales();
    sales.messageDepartment();
  }

  public void getWarehouseDepartment(){
    warehouse = new Warehouse();
    warehouse.messageDepartment();
  }

  public void getIncidentsDepartment(){
    incidents = new Incidents();
    incidents.messageDepartment();
  }
}
