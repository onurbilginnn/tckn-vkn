package com.mathartsoft.vtckn.InterfaceClass;

public class GetNumericValue {
    public int javaCharGetNumericValue(char c)
    {
        switch (c)
        {
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case '0': return 0;
            case 'A': case 'a': return 10;
            case 'B': case 'b': return 11;
            case 'C': case 'c': return 12;
            case 'D': case 'd': return 13;
            case 'E': case 'e': return 14;
            case 'F': case 'f': return 15;
            case 'G': case 'g': return 16;
            case 'H': case 'h': return 17;
            case 'I': case 'i': return 18;
            case 'J': case 'j': return 19;
            case 'K': case 'k': return 20;
            case 'L': case 'l': return 21;
            case 'M': case 'm': return 22;
            case 'N': case 'n': return 23;
            case 'O': case 'o': return 24;
            case 'P': case 'p': return 25;
            case 'Q': case 'q': return 26;
            case 'R': case 'r': return 27;
            case 'S': case 's': return 28;
            case 'T': case 't': return 29;
            case 'U': case 'u': return 30;
            case 'V': case 'v': return 31;
            case 'W': case 'w': return 32;
            case 'X': case 'x': return 33;
            case 'Y': case 'y': return 34;
            case 'Z': case 'z': return 35;
            default:
                return -1;
        }
    }
}
