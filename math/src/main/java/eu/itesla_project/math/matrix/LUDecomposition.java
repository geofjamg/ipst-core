/**
 * Copyright (c) 2017, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package eu.itesla_project.math.matrix;

/**
 * @author Geoffroy Jamgotchian <geoffroy.jamgotchian at rte-france.com>
 */
public interface LUDecomposition extends AutoCloseable {

    /**
     * Solve A * x = b
     * @param b
     */
    void solve(double[] b);

    void solve(DenseMatrix b);

    @Override
    void close();
}
