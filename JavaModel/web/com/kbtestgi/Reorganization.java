/*
               File: Reorganization
        Description: No description for object
             Author: GeneXus Java Generator version 10_3_7-99215
       Generated on: November 13, 2020 10:55:23.70
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.kbtestgi ;
import com.kbtestgi.*;
import com.genexus.*;
import com.genexus.ui.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.uifactory.*;
import com.genexus.search.*;
import java.sql.*;

public final  class Reorganization extends GXReorganization
{
   ModelContext context;
   public static void main( String args[] )
   {
      new Reorganization().executeReorg(args, true);
   }

   public Reorganization( )
   {
      super(GXcfg.class);
   }

   public String getPackageDir( )
   {
      return "com\\kbtestgi\\" ;
   }

   public void init( )
   {
      Application.setApplet( this);
   }

   public void execute( )
   {
      context = new ModelContext(getClass());
      new reorg( getHandle()).execute();
   }

}

