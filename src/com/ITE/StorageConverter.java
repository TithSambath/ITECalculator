package com.ITE;
import java.lang.Math;
public class StorageConverter {

    // Byte to any various type:

    /**
     * This Method is use to to convert from byte to kilobyte.
     * @param numByte
     * @return value as double.
     */
    double byte2KB (long numByte){
        return  (double) numByte / 1024;
    }

    /**
     * This Method is use to to convert from byte to MB.
     * @param numByte
     * @return value as double
     */
    double byte2MB (long numByte){
        return  (double) numByte / (1024 * 1024);
    }

    /**
     * This Method is use to to convert from byte to GB.
     * @param numByte
     * @return value as double
     */
    double byte2GB (long numByte){
        return (double) numByte / (Math.pow(1024,3));
    }

    double byte2TB (long numByte){
        return (double) numByte / (Math.pow(1024,4));
    }

    double byte2PB (long numByte){
        return (double) numByte / (Math.pow(1024,5));
    }

    // Kilobyte to any various type:
    /**
     * This Method is use to to convert from KB to Byte.
     * @param kilobyte
     * @return value as double
     */
    double kb2Byte(long kilobyte){
        return (double) kilobyte * 1024;
    }

    /**
     * This Method is use to to convert from KB to MB.
     * @param kilobyte
     * @return value as double
     */
    double kb2MB (long kilobyte){
        return (double) kilobyte / 1024;
    }

    /**
     * This Method is use to to convert from KB to GB.
     * @param kilobyte
     * @return value as double
     */
    double kb2GB (long kilobyte){
        return (double) kilobyte / Math.pow(1024,2);
    }

    /**
     * This Method is use to to convert from KB to TB.
     * @param kilobyte
     * @return value as double
     */
    double kb2TB (long kilobyte){
        return (double) kilobyte / Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from KB to PB
     * @param kilobyte
     * @return value as double
     */
    double kb2PB (long kilobyte){
        return (double) kilobyte / Math.pow(1024,4);
    }

    // Megabyte to any various type:

    /**
     * THis Method is use to convert from MB to Byte
     * @param Megabyte
     * @return value as double
     */
    double mb2Byte (long Megabyte){
        return (double) Megabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from MB to KB
     * @param Megabyte
     * @return value as double
     */
    double mb2KB (long Megabyte){
        return (double) Megabyte * Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from MB to GB
     * @param Megabyte
     * @return value as double
     */
    double mb2GB (long Megabyte){
        return (double) Megabyte / Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from MB to TB
     * @param Megabyte
     * @return value as double
     */
    double mb2TB (long Megabyte){
        return (double) Megabyte / Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from MB to PB
     * @param Megabyte
     * @return value as double
     */
    double mb2PB (long Megabyte){
        return (double) Megabyte / Math.pow(1024,3);
    }

    // Gigabyte to any various type:

    /**
     * This Method is use to convert from GB to Byte
     * @param gigabyte
     * @return value as double
     */
    double gb2byte (long gigabyte){
        return (double) gigabyte * Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from GB to KB
     * @param gigabyte
     * @return value as double
     */
    double gb2KB (long gigabyte){
        return (double) gigabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from GB to MB
     * @param gigabyte
     * @return value as double
     */
    double gb2MB (long gigabyte){
        return (double) gigabyte * Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from GB to TB
     * @param gigabyte
     * @return value as double
     */
    double gb2TB (long gigabyte){
        return (double) gigabyte / Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from GB to PB
     * @param gigabyte
     * @return value as double
     */
    double gb2PB (long gigabyte){
        return (double) gigabyte / Math.pow(1024,2);
    }

    // Terabyte to any various type:
    /**
     * This Method is use to convert from TB to Byte
     * @param terabyte
     * @return value as double
     */
    double tb2Byte (long terabyte){
        return (double) terabyte * Math.pow(1024,4);
    }

    /**
     * This Method is use to convert from TB to KB
     * @param terabyte
     * @return value as double
     */
    double tb2KB (long terabyte){
        return (double) terabyte * Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from TB to MB
     * @param terabyte
     * @return value as double
     */
    double tb2MB (long terabyte){
        return (double) terabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from TB to GB
     * @param terabyte
     * @return value as double
     */
    double tb2GB (long terabyte){
        return (double) terabyte * Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from TB to PB
     * @param terabyte
     * @return value as double
     */
    double tb2PB (long terabyte){
        return (double) terabyte / 1024;
    }

    // Petabyte to any various type:

    /**
     * This Method is use to convert from PB to Byte
     * @param petabyte
     * @return value as double
     */
    double pb2Byte (long petabyte){
        return (double) petabyte * Math.pow(1024,5);
    }

    /**
     * This Method is use to convert from PB to KB
     * @param petabyte
     * @return value as double
     */
    double pb2KB (long petabyte){
        return (double) petabyte * Math.pow(1024,4);
    }

    /**
     * This Method is use to convert from PB to MB
     * @param petabyte
     * @return value as double
     */
    double pb2MB (long petabyte){
        return (double) petabyte * Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from PB to GB
     * @param petabyte
     * @return value as double
     */
    double pb2GB (long petabyte){
        return  (double) petabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from PB to TB
     * @param petabyte
     * @return value as double
     */
    double pb2TB (long petabyte){
        return (double) petabyte * Math.pow(1024,1);
    }

}
