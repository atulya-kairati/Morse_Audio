package com.project.morse;

import java.util.HashMap;
import java.util.Map;

public class Data {

    static int[] sound;

    public static String toMorse(char c){


        switch (c)
        {
            case ' ':
                return "/";
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";

        }


        return null;
    }

    public static int getAudio(char c){

        switch (c) {

            case 'a':
                return R.raw.a;
            case 'b':
                return R.raw.b;
            case 'c':
                return R.raw.c;
            case 'd':
                return R.raw.d;
            case 'e':
                return R.raw.e;
            case 'f':
                return R.raw.f;
            case 'g':
                return R.raw.g;
            case 'h':
                return R.raw.h;
            case 'i':
                return R.raw.i;
            case 'j':
                return R.raw.j;
            case 'k':
                return R.raw.k;
            case 'l':
                return R.raw.l;
            case 'm':
                return R.raw.m;
            case 'n':
                return R.raw.n;
            case 'o':
                return R.raw.o;
            case 'p':
                return R.raw.p;
            case 'q':
                return R.raw.q;
            case 'r':
                return R.raw.r;
            case 's':
                return R.raw.s;
            case 't':
                return R.raw.t;
            case 'u':
                return R.raw.u;
            case 'v':
                return R.raw.v;
            case 'w':
                return R.raw.w;
            case 'x':
                return R.raw.x;
            case 'y':
                return R.raw.y;
            case 'z':
                return R.raw.z;
            case ' ':
                return R.raw.space;
        }

        return 0;
    }


}
