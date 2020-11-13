/*
               File: GXLRED
        Description: Load redundancy procedure
             Author: GeneXus Java Generator version 10_3_7-99215
       Generated on: November 13, 2020 10:55:23.48
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.kbtestgi ;
import com.kbtestgi.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class gxlred extends GXProcedure
{
   public gxlred( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxlred.class ), "" );
   }

   public gxlred( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
}

