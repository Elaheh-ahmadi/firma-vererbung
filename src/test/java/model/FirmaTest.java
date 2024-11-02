package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirmaTest {

    @Test
    void add() {
        Firma f = new Firma();
        Beamter b = null;

        try {
            f.add(b);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        b = new Beamter("Name", 'm', "Address", 34);
        boolean added;

        try {
            added = f.add(b);
            if (!added) fail();
        } catch (IllegalArgumentException e) {
            fail();
        }

        try {
            added = f.add(b);
            if (added) fail();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

    @Test
    void remove() {
        Firma f = new Firma();
        Beamter b = new Beamter("R", 'm', "a", 34);

        try {
            f.remove((Beamter) null);
            fail();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            f.remove(b);
            fail();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        f.add(b);
        try {
            f.remove(b);
        } catch (Exception e) {
            fail();
        }


    }

    @Test
    void testRemove() {
        Firma f = new Firma();
        Beamter b = new Beamter("R", 'm', "a", 34);
        int count;

        try {
            f.remove((String) null);
            fail();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            count = f.remove("R");
            if(count > 0) fail();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        f.add(b);
        try {
            count = f.remove("R");
            if(count != 1) fail();
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    void zaehleGeschlecht() {
        Firma f =new Firma();
        f.add(new Beamter("R",'m',"a",34));
        f.add(new Beamter("R",'m',"a",34));
        f.add(new Beamter("R",'f',"a",34));
        f.add(new Beamter("R",'f',"a",34));

        int m = f.zaehleGeschlecht('m');
        int _f = f.zaehleGeschlecht('f');

        if(_f != 2) fail();
        if(m != 2) fail();
    }
}