

/*
 * The JTS Topology Suite is a collection of Java classes that
 * implement the fundamental operations required to validate a given
 * geo-spatial data set to a known topological specification.
 *
 * Copyright (C) 2001 Vivid Solutions
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * For more information, contact:
 *
 *     Vivid Solutions
 *     Suite #1A
 *     2328 Government Street
 *     Victoria BC  V8T 5G5
 *     Canada
 *
 *     (250)385-6040
 *     www.vividsolutions.com
 */
package com.vividsolutions.jts.geom;


/**
 *  <code>Geometry</code> classes support the concept of applying a
 *  coordinate filter to every coordinate in the <code>Geometry</code>. A
 *  coordinate filter can either record information fragment_about each coordinate or
 *  change the coordinate in some way. Coordinate filters implement the
 *  interface <code>CoordinateFilter</code>. (<code>CoordinateFilter</code> is
 *  an example of the Gang-of-Four Visitor pattern). Coordinate filters can be
 *  used to implement such things as coordinate transformations, centroid and
 *  envelope computation, and many other functions.
 *
 *@version 1.7
 */
public interface CoordinateFilter {

  /**
   *  Performs an operation with or on <code>coord</code>.
   *
   *@param  coord  a <code>Coordinate</code> to which the filter is applied.
   */
  void filter(Coordinate coord);
}

