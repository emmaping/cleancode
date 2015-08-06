package BootCamp.cleancode;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParkingManagerTest
{
  @BeforeClass
  private void Setup()
  {

  }

  @Test
  public void print_manager_boys_parkinglots_relationship()
  {
    ParkingManager pm = new ParkingManager(5, "ParkingManager");
    ParkingBoy pb1 = new ParkingBoy(0, "ParkingBoy1");
    ParkingBoy pb2 = new ParkingBoy(0, "ParkingBoy2");
    ParkingBoy pb3 = new ParkingBoy(0, "ParkingBoy3");

    pm.BalanceParkingLot(pb1, pm.getParkingLot("parkingLot2"));
    pm.BalanceParkingLot(pb1, pm.getParkingLot("parkingLot3"));
    pm.BalanceParkingLot(pb2, pm.getParkingLot("parkingLot4"));
    pm.BalanceParkingLot(pb3, pm.getParkingLot("parkingLot5"));
    pm.printParkinglots();

    Assert.assertSame(pm.printParkinglots(), "");
  }
}
