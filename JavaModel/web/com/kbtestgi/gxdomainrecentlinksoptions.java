/*
               File: RecentLinksOptions
        Description: RecentLinksOptions
             Author: GeneXus Java Generator version 10_3_7-99215
       Generated on: November 13, 2020 10:55:36.3
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.kbtestgi ;
public final  class gxdomainrecentlinksoptions
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Short((short)8), "Size");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        short key )
   {
      if (domain.containsKey( key ))
      {
         return (String)domain.get( key );
      }
      else
      {
         return "";
      }
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(Short.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Short) itr.next());
      }
      return value;
   }

}

