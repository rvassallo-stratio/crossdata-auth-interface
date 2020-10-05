/*
 * © 2017 Stratio Big Data Inc., Sucursal en España. All rights reserved.
 *
 * This software – including all its source code – contains proprietary information of Stratio Big Data Inc., Sucursal en España and may not be revealed, sold, transferred, modified, distributed or otherwise made available, licensed or sublicensed to third parties; nor reverse engineered, disassembled or decompiled, without express written authorization from Stratio Big Data Inc., Sucursal en España.
 */
package com.stratio.crossdata.security

/**
  * WARNING: Update crossdata plugin when modifying the actions
  */
sealed trait Action

case object Read extends Action

case object Write extends Action

case object Create extends Action

case object Drop extends Action

case object Cache extends Action

case object Bind extends Action

case object FilterColumn extends Action

case object Other extends Action

/**BDL actions*/
case object Insert extends Action

case object Delete extends Action

case object Update extends Action

case object FilterRow extends Action


