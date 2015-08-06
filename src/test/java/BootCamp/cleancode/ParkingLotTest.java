package BootCamp.cleancode;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParkingLotTest
{
  @Test
  public void should_success_park_a_car()
  {
    Car car = new Car("88888");
    ParkingLot parkingLot = new ParkingLot(100);
    Assert.assertEquals(parkingLot.park(car).intValue(), 1);
  }

  @Test
  public void success_get_car_by_lotNumber()
  {
    Car car = new Car("77777");
    ParkingLot parkingLot = new ParkingLot(100);
    int lotId = parkingLot.park(car).intValue();
    Car getCar = parkingLot.getCar(lotId);
    Assert.assertEquals(car.equals(getCar), true);
  }

  @Test
  public void failed_get_car_by_lotNumber()
  {
    Car car = new Car("77777");
    ParkingLot parkingLot = new ParkingLot(100);
    Car getCar = parkingLot.getCar(99);
    Assert.assertEquals(car.equals(getCar), false);
  }

  @Test
  public void success_get_car_by_carId()
  {
    Car car = new Car("99999");
    ParkingLot parkingLot = new ParkingLot(100);
    parkingLot.park(car);
    Car getCar = parkingLot.getCar("99999");
    Assert.assertEquals(car.equals(getCar), true);
  }

  @Test
  public void available_parkinglot_should_be_97_after_park_3_cars()
  {
    Car car1 = new Car("77777");
    Car car2 = new Car("87777");
    Car car3 = new Car("999777");
    ParkingLot parkingLot = new ParkingLot(100);
    parkingLot.park(car1);
    parkingLot.park(car2);
    parkingLot.park(car3);

    int availableParkingLot = parkingLot.getAvailableParkLot();
    Assert.assertEquals(availableParkingLot, 97);
  }

  @Test
  public void return_null_given_101_cars()
  {
    ParkingLot parkingLot = new ParkingLot(100);
    for (int i = 0; i < 100; i++)
    {
      Car car = new Car(UUID.randomUUID().toString());
      parkingLot.park(car);
    }
    Car car = new Car("101");
    Assert.assertEquals(parkingLot.park(car), null);
    Assert.assertEquals(parkingLot.getAvailableParkLot(), 0);
  }

  @Test
  public void return_null_given_0_available_when_get_car()
  {
    ParkingLot parkingLot = new ParkingLot(100);
    Car car = new Car("101");
    Assert.assertEquals(parkingLot.getCar("101"), null);

  }

}
