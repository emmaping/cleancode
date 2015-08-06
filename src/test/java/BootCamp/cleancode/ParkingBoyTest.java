package BootCamp.cleancode;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParkingBoyTest
{
  private NormalStategy normalStategy = new NormalStategy();
  private SmartStategy smartStategy = new SmartStategy();
  private SuperSmartStrategy superSmartStrategy = new SuperSmartStrategy();

  @Test
  public void success_park_1_car_into_parklot_1()
  {
    ParkingBoy parkingBoy = new ParkingBoy(5);
    parkingBoy.setParkingStrategy(normalStategy);
    Car car = new Car("10000");
    ParkTicket parkTicket = parkingBoy.park(car);
    ParkingLot actual = parkTicket.getParkingLot();
    ParkingLot expected = parkingBoy.getParkingLot(1);
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void success_park_101th_car_into_parklot_2()
  {
    new ParkingLot(10);
    new ParkingLot(10);
    new ParkingLot(1);

    ParkingBoy parkingBoy = new ParkingBoy(5);
    parkingBoy.setParkingStrategy(normalStategy);
    for (int i = 0; i < 100; i++)
    {
      Car car = new Car(UUID.randomUUID().toString());
      parkingBoy.park(car);
    }
    Car car = new Car("101");
    ParkTicket parkTicket = parkingBoy.park(car);
    Assert.assertEquals(parkTicket.getParkingLot(), parkingBoy.getParkingLot(2));
  }

  @Test
  public void success_get_car_from_parklot_1()
  {
    ParkingBoy parkingBoy = new ParkingBoy(5);
    parkingBoy.setParkingStrategy(normalStategy);
    Car car = new Car("10000");
    ParkTicket parkTicket = parkingBoy.park(car);
    Car getCar = parkingBoy.getCar(parkTicket);
    Assert.assertEquals(car.equals(getCar), true);
  }

  @Test
  public void sucess_store_car_to_most_empty_parklot_via_smartstrategy()
  {
    ParkingBoy parkingBoy = new ParkingBoy(2);
    parkingBoy.setParkingStrategy(smartStategy);
    Car car = new Car("001");
    ParkTicket parkTicket = parkingBoy.park(car);
    Assert.assertEquals(parkTicket.getParkingLot(), parkingBoy.getParkingLot(1));

    Car car2 = new Car("002");
    ParkTicket parkTicket2 = parkingBoy.park(car2);
    Assert.assertEquals(parkTicket2.getParkingLot(), parkingBoy.getParkingLot(2));

  }

  @Test
  public void sucess_store_car_to_most_empty_parklot_via_supersmartstrategy()
  {
    ParkingBoy parkingBoy = new ParkingBoy(1);
    parkingBoy.setParkingStrategy(superSmartStrategy);
    ParkingLot parkingLot1 = new ParkingLot(100);
    ParkingLot parkingLot2 = new ParkingLot(20);
    parkingBoy.addParkingLot(parkingLot1);
    parkingBoy.addParkingLot(parkingLot2);
    Car car = new Car("001");
    ParkTicket parkTicket = parkingBoy.park(car);
    Assert.assertEquals(parkTicket.getParkingLot(), parkingBoy.getParkingLot(1));

    Car car2 = new Car("002");
    ParkTicket parkTicket2 = parkingBoy.park(car2);
    Assert.assertEquals(parkTicket2.getParkingLot(), parkingBoy.getParkingLot(2));
    Car car3 = new Car("003");
    ParkTicket parkTicket3 = parkingBoy.park(car3);
    Assert.assertEquals(parkTicket3.getParkingLot(), parkingBoy.getParkingLot(3));

    Car car4 = new Car("004");
    ParkTicket parkTicket4 = parkingBoy.park(car4);
    Assert.assertEquals(parkTicket4.getParkingLot(), parkingBoy.getParkingLot(2));

  }

}
