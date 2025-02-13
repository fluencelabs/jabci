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

import com.github.jtendermint.jabci.types.RequestBeginBlock;
import com.github.jtendermint.jabci.types.ResponseBeginBlock;

public interface IBeginBlock {

    /**
     * <p>Signals the beginning of a new block. Called prior to any DeliverTxs.</p>
     * <p>Arguments:</p>
     * <ul>
     *   <li>{@code Hash ([]byte)}: The block's hash. This can be derived from the
     *     block header.
     *   <li>{@code Header}: The block header.
     *   <li>{@code LastCommitInfo (LastCommitInfo)}: Info about the last commit, including the
     *     round, and the list of validators and which ones signed the last block.
     *   <li>{@code ByzantineValidators ([]Evidence)}: List of evidence of
     *     validators that acted maliciously.
     *</ul>
     *
     *<p>Returns:</p>
     *<ul>
     *<li>{@code Tags ([]cmn.KVPair)}: Key-Value tags for filtering and indexing
     *</ul>
     * @param req
     * @return
     * @see <a href="https://tendermint.com/docs/spec/abci/abci.html#beginblock">In Documentation</a>
     */
    ResponseBeginBlock requestBeginBlock(RequestBeginBlock req);

}
