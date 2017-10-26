/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.hadoop.gateway.topology.discovery.ambari;

import org.apache.hadoop.gateway.i18n.messages.Message;
import org.apache.hadoop.gateway.i18n.messages.MessageLevel;
import org.apache.hadoop.gateway.i18n.messages.Messages;
import org.apache.hadoop.gateway.i18n.messages.StackTrace;

@Messages(logger="org.apache.hadoop.gateway.topology.discovery.ambari")
public interface AmbariServiceDiscoveryMessages {

    @Message(level = MessageLevel.ERROR,
            text = "Failed to load service discovery configuration: {1}")
    void failedToLoadServiceDiscoveryConfiguration(@StackTrace(level = MessageLevel.ERROR) Exception e);

    @Message(level = MessageLevel.ERROR,
             text = "Failed to load service discovery configuration {0}: {1}")
    void failedToLoadServiceDiscoveryConfiguration(final String configuration,
                               @StackTrace(level = MessageLevel.ERROR) Exception e);

    @Message(level = MessageLevel.ERROR,
             text = "Encountered an error during cluster {0} discovery: {1}")
    void clusterDiscoveryError(final String clusterName,
                               @StackTrace(level = MessageLevel.ERROR) Exception e);


    @Message(level = MessageLevel.DEBUG,
             text = "REST invocation {0} failed: {1}")
    void restInvocationError(final String url,
                             @StackTrace(level = MessageLevel.ERROR) Exception e);


    @Message(level = MessageLevel.ERROR,
             text = "Encountered an error attempting to determine the user for alias {0} : {1}")
    void aliasServiceUserError(final String alias, final String error);


    @Message(level = MessageLevel.ERROR,
             text = "Encountered an error attempting to determine the password for alias {0} : {1}")
    void aliasServicePasswordError(final String alias, final String error);


    @Message(level = MessageLevel.ERROR,
             text = "No user configured for Ambari service discovery.")
    void aliasServiceUserNotFound();


    @Message(level = MessageLevel.ERROR,
             text = "No password configured for Ambari service discovery.")
    void aliasServicePasswordNotFound();


    @Message(level = MessageLevel.ERROR,
             text = "Unexpected REST invocation response code for {0} : {1}")
    void unexpectedRestResponseStatusCode(final String url, int responseStatusCode);


    @Message(level = MessageLevel.ERROR,
             text = "REST invocation {0} yielded a response without any JSON.")
    void noJSON(final String url);


    @Message(level = MessageLevel.DEBUG,
             text = "REST invocation result: {0}")
    void debugJSON(final String json);

    @Message(level = MessageLevel.DEBUG,
            text = "Loaded component configuration mappings: {0}")
    void loadedComponentConfigMappings(final String mappings);

    @Message(level = MessageLevel.ERROR,
             text = "Failed to load component configuration property mappings {0}: {1}")
    void failedToLoadComponentConfigMappings(final String mappings,
                                             @StackTrace(level = MessageLevel.ERROR) Exception e);

    @Message(level = MessageLevel.DEBUG,
             text = "Discovered: Service: {0}, Host: {1}")
    void discoveredServiceHost(final String serviceName, final String hostName);


    @Message(level = MessageLevel.DEBUG,
             text = "Querying the cluster for the {0} configuration ({1}) property: {2}")
    void lookingUpServiceConfigProperty(final String serviceName, final String configType, final String propertyName);


    @Message(level = MessageLevel.DEBUG,
             text = "Querying the cluster for the {0} component configuration property: {1}")
    void lookingUpComponentConfigProperty(final String componentName, final String propertyName);


    @Message(level = MessageLevel.DEBUG,
             text = "Querying the cluster for the {0} component's hosts")
    void lookingUpComponentHosts(final String componentName);


    @Message(level = MessageLevel.DEBUG,
            text = "Handling a derived service URL mapping property for the {0} service: type = {1}, name = {2}")
    void handlingDerivedProperty(final String serviceName, final String propertyType, final String propertyName);


    @Message(level = MessageLevel.DEBUG,
            text = "Determined the service URL mapping property {0} value: {1}")
    void determinedPropertyValue(final String propertyName, final String propertyValue);


}
