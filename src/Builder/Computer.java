package Builder;

public class Computer {

    //Required Parameters
     private String HDD;
    private String RAM;

    //Optional Parameters
    private Boolean isGraphicsCardEnabled;
    private Boolean isBluetoothEnabled;

    public String getHDD(){
        return HDD;
    }
    public String getRAM(){
        return RAM;
    }
    public Boolean getIsBluetoothEnabled(){
        return isBluetoothEnabled;
    }
    public Boolean getIsGraphicsCardEnabled(){
        return isGraphicsCardEnabled;
    }

    private Computer(ComputerBuilder computerBuilder){
        this.HDD=computerBuilder.HDD;
        this.RAM=computerBuilder.RAM;
        this.isGraphicsCardEnabled=computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;
    }

    public static class ComputerBuilder{

    //Required Parameters
        private String HDD;
        private String RAM;

        //Optional Parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd,String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isBluetoothEnabled=isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled (boolean isBlueToothEnabled){
            this.isBluetoothEnabled=isBluetoothEnabled;
            return this;
        }

        public Computer Build(){
            return new Computer(this);
        }

    }
}
