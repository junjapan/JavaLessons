package Day20211027.usb;

public class PC {
    Usb usbDevice;
    void setUsbDevise(Usb devise){
        this.usbDevice=devise;
    }
    void executeUsb(){
        if(this.usbDevice == null){
            System.out.println("usb機器は接続されてません");
            return;
        }
        this.usbDevice.execute();
    }
}
