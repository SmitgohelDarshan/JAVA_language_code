//Create interface EventListener with performEvent() method. 
interface EventListener {
    void performEvent();
}
/*
 Create MouseListener 
interface which inherits EventListener along with mouseClicked(), mousePressed(), 
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
interface which inherits EventListener along with keyPressed(), keyReleased() methods.
 */
interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

/*
create EventDemo class which implements MouseListener and KeyListener and 
demonstrate all the methods of the interfaces
 */

class EventDemo implements MouseListener, KeyListener {
    public void performEvent(){
        System.out.println("Mouse Event called.");
    }
    public void mouseClicked(){
        System.out.println("Mouse Clicked called."); 
    }

    public void mousePressed(){
        System.out.println("Mouse Pressed called.");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released called.");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved called.");
    }
    public void mouseDragged(){
        System.out.println("MOuse Dragged called.");
    }
    public void keyPressed(){
        System.out.println("Key Pressed called.");
    }
    public void keyReleased(){
        System.out.println("Key Released called.");
    }
}

public class A4 {
    public static void main(String[] args) {
        EventDemo ed1 = new EventDemo();
        ed1.performEvent();
        ed1.mouseClicked();
        ed1.mousePressed();
        ed1.mouseReleased();
        ed1.mouseMoved();
        ed1.mouseDragged();
        ed1.mousePressed();
        ed1.mouseReleased();
        ed1.keyPressed();
        ed1.keyReleased();
    }
}