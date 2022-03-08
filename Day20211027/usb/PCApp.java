package Day20211027.usb;

public class PCApp {
    public static void main(String[] args) {
        PC pc = new PC();
        Usb[] usbDevise={
            new UsbMemory(),
            new UsbFan()
        };
        pc.setUsbDevise(usbDevise[0]);
        pc.executeUsb();
        pc.setUsbDevise(usbDevise[1]);
        pc.executeUsb();
    }
}
