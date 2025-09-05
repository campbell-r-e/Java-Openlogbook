
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
 * Added ADIF 3.1.5 modes 
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
   
 public static final Mode Blank        = new Mode("");          // app convenience
public static final Mode Unknown      = new Mode("Unknown");   // optional app value

public static final Mode SSB          = new Mode("SSB");
public static final Mode CW           = new Mode("CW");
public static final Mode FM           = new Mode("FM");
public static final Mode AM           = new Mode("AM");

public static final Mode ATV          = new Mode("ATV");
public static final Mode CLOVER       = new Mode("CLOVER");
public static final Mode FAX          = new Mode("FAX");
public static final Mode PACKET       = new Mode("PACKET");
public static final Mode RTTY         = new Mode("RTTY");
public static final Mode SSTV         = new Mode("SSTV");

public static final Mode TOR          = new Mode("TOR");       // AMTOR/GTOR are submodes
public static final Mode PACTOR       = new Mode("PACTOR");    // PAC2/PAC3 are submodes
public static final Mode HELL         = new Mode("HELL");
public static final Mode PSK          = new Mode("PSK");       // PSK31/63/125 are submodes
public static final Mode MFSK         = new Mode("MFSK");      // MFSK8/16, FT8, FT4, MSK144, etc. are submodes
public static final Mode DIGITALVOICE = new Mode("DIGITALVOICE"); // D-STAR/DMR/FreeDV are submodes

 
  private static final Mode _values[] = {
    Blank,
    SSB,
    CW,
    FM,
    AM,
    ATV,
    CLOVER,        // was CLO
    FAX,
    PACKET,        // was PKT
    RTTY,
    SSTV,
    TOR,           // parent for AMTOR, GTOR, etc.
    PACTOR,        // was PAC
    HELL,
    PSK,           // parent for PSK31/63/125
    MFSK,          // parent for MFSK8/16
    DIGITALVOICE   // e.g. D-STAR, DMR, FreeDV
};


   /**
    * A mapping of the objects to the constants as Integers.  These valus MUST mimic _values.  ADIF 1.0 only uses a subset
    * of the total enumerations I've defined.  The ones that aren't use are commented out.
    */
   private static final Object[][] _intlookupData = {
     { Integer.valueOf(0),  Mode.Blank },
    { Integer.valueOf(3),  Mode.SSB },
    { Integer.valueOf(4),  Mode.CW },
    { Integer.valueOf(5),  Mode.FM },
    { Integer.valueOf(6),  Mode.AM },
    { Integer.valueOf(8),  Mode.ATV },
    { Integer.valueOf(9),  Mode.CLOVER },   // CLO in your enum
    { Integer.valueOf(10), Mode.FAX },
    { Integer.valueOf(27), Mode.PACKET },   // PKT synonym
    { Integer.valueOf(32), Mode.RTTY },
    { Integer.valueOf(33), Mode.SSTV },
    { Integer.valueOf(35), Mode.TOR },      // parent for AMTOR, GTOR, etc.
    { Integer.valueOf(23), Mode.PACTOR },   // PAC synonym
    { Integer.valueOf(14), Mode.HELL },
    { Integer.valueOf(28), Mode.PSK },      // parent for PSK31/63/125
    { Integer.valueOf(18), Mode.MFSK },     // parent for MFSK8/16
    { Integer.valueOf(40), Mode.DIGITALVOICE } // e.g. D-STAR, DMR, etc.
   } ;
   
     
      
      /**
       * A mapping of the objects to the constants as Strings.  These are the values that are supported by ADIF 1.0.
       */
      private static final Object[][] _strlookupData = {
         {new String(""), Mode.Blank},
         {new String("Unknown"), Mode.Unknown},
         { "AM",             Mode.AM },
         { "FM",             Mode.FM },
         { "SSB",            Mode.SSB },
         { "CW",             Mode.CW },
         { "RTTY",           Mode.RTTY },
         { "PSK",            Mode.PSK },
         { "MFSK",           Mode.MFSK },
         { "HELL",           Mode.HELL },        // Hellschreiber (mode)
         { "SSTV",           Mode.SSTV },
         { "ATV",            Mode.ATV },
         { "FAX",            Mode.FAX },
         { "PACKET",         Mode.PACKET },
         { "PACTOR",         Mode.PACTOR },
         { "CLOVER",         Mode.CLOVER },
         { "TOR",            Mode.TOR },         // AMTOR/GTOR are SUBMODEs under TOR
         { "DIGITALVOICE",   Mode.DIGITALVOICE },
   } ;
   
   private static final IntToObject _intToModeType = new IntToObject(_intlookupData, Mode.Unknown) ;
   private static final StringToObject _strToModeType = new StringToObject(_strlookupData, Mode.Unknown) ;
}
