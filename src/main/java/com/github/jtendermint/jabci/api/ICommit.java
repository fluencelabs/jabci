/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 - 2018
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.jtendermint.jabci.api;

import com.github.jtendermint.jabci.types.RequestCommit;
import com.github.jtendermint.jabci.types.ResponseCommit;

public interface ICommit {

    /***
     * <p>Persist the application state.</p>
     * <p>Return an (optional) Merkle root hash of the application state</p>
     * <p>ResponseCommit.Data is included as the Header.AppHash in the next block</p>
     *
     * <p>Returns:</p>
     * <ul>
     *     <li>- {@code Data ([]byte)}: The Merkle root hash of the application state
     * </ul>
     *
     * @see <a href="https://tendermint.com/docs/spec/abci/abci.html#checktx">In Documentation</a>
     */
    ResponseCommit requestCommit(RequestCommit requestCommit);

}
