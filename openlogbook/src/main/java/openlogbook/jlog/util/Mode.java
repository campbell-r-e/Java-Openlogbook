
/*
 * openlogbook - Amateur Radio Logging Software
 * 
 * Copyright (C) 2013 minex123
 * Contributor: Ron Kinney (GitHub: septantrionalis) - 2019
 * Update by: Campbell Reed - 2025
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * --- Modification Notice ---
 * Changes made by Campbell Reed (2025):
 * - Fixed a typo in the FM mode definition to ensure proper mode selection.
 *
 * This modification retains the original GPL licensing terms and ensures that
 * the software remains free and open-source.
 */



package openlogbook.jlog.util;

/**
 * An enumeration of Mode types.
 * 
 * @author KC0ZPS
 */
public class Mode {

   /**
    * Creates a new Mode.  The constructor is private.  The only instances are the constants
    * instantiated in this module.
    * 
    * @param description   Description of this meeting type.
    */
   private Mode(String description) {
       _description = description ;
   }

   //**********
   // Public methods
   //**********

   /**
    * Returns the IntToObject object.
    * 
    * @return the IntToObject object.
    */
   public static IntToObject getIntToModeType() {
       return _intToModeType ;
   }

   /**
    * Returns the StringToObject object.
    * 
    * @return the StringToObject object.
    */
   public static StringToObject getStrToModeType() {
       return _strToModeType ;
   }

   /**
    * Returns all objects represented by this class as an array.
    * 
    * @return all objects represented by this class as an array.
    */
   public static Mode[] getValues() {
      return _values ;
   }

   //**********
   // Methods overridden from Object
   //**********
   
   /**
    * Returns a string representation of the object.
    * 
    * @return string representation of the object.
    */
   public String toString() {
       return _description ;
   }

   //**********
   // Class attributes and constants
   //**********
   private String                    _description ;
   
   public static final Mode Blank    = new Mode("") ;   
   public static final Mode Unknown  = new Mode("Unknown") ;
   public static final Mode LSB      = new Mode("LSB") ;
   public static final Mode USB      = new Mode("USB") ;
   public static final Mode SSB      = new Mode("SSB") ;
   public static final Mode CW       = new Mode("CW") ;
   public static final Mode FM       = new Mode("FM") ;
   public static final Mode AM       = new Mode("AM") ;
   public static final Mode ASCI     = new Mode("ASCI") ;
   public static final Mode ATV      = new Mode("ATV") ;
   public static final Mode CLO      = new Mode("CLO") ;
   public static final Mode FAX      = new Mode("FAX") ;
   public static final Mode FSK      = new Mode("FSK") ;
   public static final Mode FSK441   = new Mode("FSK441") ;
   public static final Mode GTOR     = new Mode("GTOR") ;
   public static final Mode HELL     = new Mode("HELL") ;
   public static final Mode HFSK     = new Mode("HFSK") ;
   public static final Mode JT44     = new Mode("JT44") ;
   public static final Mode JT65     = new Mode("JT65") ;
   public static final Mode MFSK8    = new Mode("MFSK8") ;
   public static final Mode MFSK16   = new Mode("MFSK16") ;
   public static final Mode MTTY     = new Mode("MTTY") ;
   public static final Mode MT63     = new Mode("MT63") ;
   public static final Mode OLIVIA   = new Mode("OLIVIA") ;
   public static final Mode PAC      = new Mode("PAC") ;
   public static final Mode PAC2     = new Mode("PAC2") ;
   public static final Mode PAC3     = new Mode("PAC3") ;
   public static final Mode PCW      = new Mode("PCW") ;
   public static final Mode PKT      = new Mode("PKT") ;
   public static final Mode PSK31    = new Mode("PSK31") ;
   public static final Mode PSK63    = new Mode("PSK63") ;
   public static final Mode PSK125   = new Mode("PSK125") ;
   public static final Mode Q15      = new Mode("Q15") ;
   public static final Mode RTTY     = new Mode("RTTY") ;
   public static final Mode SSTV     = new Mode("SSTV") ;
   public static final Mode THRB     = new Mode("THRB") ;
   public static final Mode TOR      = new Mode("TOR") ;
   public static final Mode FT8      = new Mode("FT8") ;
   public static final Mode FT4      = new Mode("FT4") ;
   public static final Mode MSK144      = new Mode("MSK144") ;
   public static final Mode WSPR      = new Mode("WSPR") ;
   public static final Mode THOR      = new Mode("THOR") ;
   public static final Mode DOMINO      = new Mode("DOMINO") ;
   public static final Mode FREEDV      = new Mode("FREEDV") ;
 
   private static final Mode _values[] = {
      Blank,
      LSB,
      USB,
      SSB,
      CW,
      FM,
      AM,
      ASCI,
      ATV,
      CLO,
      FAX,
      FSK,
      FSK441,
      GTOR,
      HELL,
      HFSK,
      JT44,
      JT65,
      MFSK8,
      MFSK16,
      MTTY,
      MT63,
      OLIVIA,
      PAC,
      PAC2,
      PAC3,
      PCW,
      PKT,
      PSK31,
      PSK63,
      PSK125,
      Q15,
      RTTY,
      SSTV,
      THRB,
      TOR,
      FT8,
      FT4,
      MSK144,
      WSPR,
      THOR,
      DOMINO,
      FREEDV,
      
   } ;

   /**
    * A mapping of the objects to the constants as Integers.  These valus MUST mimic _values.  ADIF 1.0 only uses a subset
    * of the total enumerations I've defined.  The ones that aren't use are commented out.
    */
   private static final Object[][] _intlookupData = {
      {new Integer(0), Mode.Blank},
      {new Integer(1), Mode.LSB},
      {new Integer(2), Mode.USB},
      {new Integer(3), Mode.SSB},
      {new Integer(4), Mode.CW},
      {new Integer(5), Mode.FM},
      {new Integer(6), Mode.AM},
      {new Integer(7), Mode.ASCI},
      {new Integer(8), Mode.ATV},
      {new Integer(9), Mode.CLO},
      {new Integer(10), Mode.FAX},
      {new Integer(11), Mode.FSK},
      {new Integer(12), Mode.FSK441},
      {new Integer(13), Mode.GTOR},
      {new Integer(14), Mode.HELL},
      {new Integer(15), Mode.HFSK},
      {new Integer(16), Mode.JT44},
      {new Integer(17), Mode.JT65},
      {new Integer(18), Mode.MFSK8},
      {new Integer(19), Mode.MFSK16},
      {new Integer(20), Mode.MTTY},
      {new Integer(21), Mode.MT63},
      {new Integer(22), Mode.OLIVIA},
      {new Integer(23), Mode.PAC},
      {new Integer(24), Mode.PAC2},
      {new Integer(25), Mode.PAC3},
      {new Integer(26), Mode.PCW},
      {new Integer(27), Mode.PKT},
      {new Integer(28), Mode.PSK31},
      {new Integer(29), Mode.PSK63},
      {new Integer(30), Mode.PSK125},
      {new Integer(31), Mode.Q15},
      {new Integer(32), Mode.RTTY},
      {new Integer(33), Mode.SSTV},
      {new Integer(34), Mode.THRB},
      {new Integer(35), Mode.TOR},
      {new Integer(36), Mode.FT8},
      {new Integer(37), Mode.FT4},
      {new Integer(38), Mode.MSK144},
      {new Integer(39), Mode.WSPR},
      {new Integer(40), Mode.THOR},
      {new Integer(41), Mode.DOMINO},
      {new Integer(42), Mode.FREEDV},
   } ;
   
     
      
      /**
       * A mapping of the objects to the constants as Strings.  These are the values that are supported by ADIF 1.0.
       */
      private static final Object[][] _strlookupData = {
         {new String(""), Mode.Blank},
         {new String("Unknown"), Mode.Unknown},
         {new String("SSB"), Mode.SSB},
         {new String("CW"), Mode.CW},
         {new String("RTTY"), Mode.RTTY},
         {new String("TOR"), Mode.TOR},
         {new String("PKT"), Mode.PKT},
         {new String("AM"), Mode.AM},
         {new String("FM"), Mode.FM},
         {new String("SSTV"), Mode.SSTV},
         {new String("ATV"), Mode.ATV},
         {new String("PAC"), Mode.PAC},
         {new String("CLO"), Mode.CLO},
         //
         {new String("FAX"), Mode.FAX},
         {new String("FSK"), Mode.FSK},
         {new String("FSK441"), Mode.FSK441},
         {new String("GTOR"), Mode.GTOR},
         {new String("HELL"), Mode.HELL},
         {new String("HFSK"), Mode.HFSK},
         {new String("JT44"), Mode.JT44},
         {new String("JT65"), Mode.JT65},
         {new String("MFSK8"), Mode.MFSK8},
         {new String("MFSK16"), Mode.MFSK16},
         {new String("MTTY"), Mode.MTTY},
         {new String("MT63"), Mode.MT63},
         {new String("OLIVIA"), Mode.OLIVIA},
         {new String("PAC2"), Mode.PAC2},
         {new String("PAC3"), Mode.PAC3},
         {new String("PCW"), Mode.PCW},
         {new String("PSK31"), Mode.PSK31},
         {new String("PSK63"), Mode.PSK63},
         {new String("PSK125"), Mode.PSK125},
         {new String("Q15"), Mode.Q15},
         {new String("THRB"), Mode.THRB},
         {new String("TOR"), Mode.TOR},
         {new String("FT8"), Mode.FT8},
         {new String("FT4"), Mode.FT4},
         {new String("MSK144"), Mode.MSK144},
         {new String("WSPR"), Mode.WSPR},
         {new String("DOMINO"), Mode.DOMINO},
         {new String("FREEDV"), Mode.FREEDV},
   } ;
   
   private static final IntToObject _intToModeType = new IntToObject(_intlookupData, Mode.Unknown) ;
   private static final StringToObject _strToModeType = new StringToObject(_strlookupData, Mode.Unknown) ;
}
