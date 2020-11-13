/*
               File: CryptoEncryptAlgorithm
        Description: CryptoEncryptAlgorithm
             Author: GeneXus Java Generator version 10_3_7-99215
       Generated on: November 13, 2020 10:55:35.88
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.kbtestgi ;
public final  class gxdomaincryptoencryptalgorithm
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"Rijndael"), "Rijndael");
      domain.put(new String((String)"DES"), "DES");
      domain.put(new String((String)"TripleDES"), "Triple DES");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return (String)domain.get( key.trim() );
      }
      else
      {
         return "";
      }
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}

