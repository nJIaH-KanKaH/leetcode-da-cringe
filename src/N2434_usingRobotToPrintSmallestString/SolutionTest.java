package N2434_usingRobotToPrintSmallestString;

import N2434_usingRobotToPrintSmallestString.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case zza returns azz")
    void robotWithString_zza_azz() {
        Solution solution = new Solution();
        String a = "zza";
        assertEquals("azz",solution.robotWithString(a));
    }
    @Test
    @DisplayName("test case bac returns abc")
    void robotWithString_bac_abc() {
        Solution solution = new Solution();
        String a = "bac";
        assertEquals("abc",solution.robotWithString(a));
    }
    @Test
    @DisplayName("test case bdda returns addb")
    void robotWithString_bdda_addb() {
        Solution solution = new Solution();
        String a = "bdda";
        assertEquals("addb",solution.robotWithString(a));
    }

    @Test
    @DisplayName("test case bydizfve returns bdevfziy")
    void robotWithString_bydizfve_(){Solution solution = new Solution();
        String a = "bydizfve";
        assertEquals("bdevfziy",solution.robotWithString(a));
    }
}