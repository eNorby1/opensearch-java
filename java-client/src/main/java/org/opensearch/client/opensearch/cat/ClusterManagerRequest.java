/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cat;

import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;

import java.util.HashMap;

// typedef: cat.cluster_manager.Request

/**
 * Returns information about the cluster-manager node.
 *
 */
public class ClusterManagerRequest extends CatRequestBase {
	public ClusterManagerRequest() {
	}

	/**
	 * Singleton instance for {@link ClusterManagerRequest}.
	 */
	public static final ClusterManagerRequest _INSTANCE = new ClusterManagerRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.master}".
	 */
	@Deprecated
	public static final Endpoint<ClusterManagerRequest, ClusterManagerResponse, ErrorResponse> _DEPRECATED_ENDPOINT = new SimpleEndpoint<>(

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/master";

			},

			// Request parameters
			request -> new HashMap<>(request.queryParameters()), SimpleEndpoint.emptyMap(), false, ClusterManagerResponse._DESERIALIZER);

	/**
	 * Endpoint "{@code cat.cluster_manager}".
	 */
	public static final Endpoint<ClusterManagerRequest, ClusterManagerResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/cluster_manager";

			},

			// Request parameters
			request -> new HashMap<>(request.queryParameters()), SimpleEndpoint.emptyMap(), false, ClusterManagerResponse._DESERIALIZER);
}
