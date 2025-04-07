/**
 *  Copyright 2025 Megamind
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *  
 *    Virtual Mode Selector
 *    Created for Use with Home Assistant to Select Modes.  
 * 
 *   Date            Description
 *   -------------   -----------------------------------------------------------------------------
 *   04-07-2025      0.1.0 Initial Alpha Driver
 *
 * LINE 30 MAX 
 */

public static String version() {return "0.1.0"}

// Define a constant list of available modes. Update this list to add or remove modes.
def AVAILABLE_MODES = ["Home", "Away", "Night", "Guest", "Vacation"]

metadata {
    definition(name: "Virtual Mode Selector", namespace: "yourNamespace", author: "Your Name") {
        capability "Actuator"
        capability "Refresh"
        // Use the constant for the command parameter's constraints.
        command "setMode", [
            [ name:"newMode", type:"ENUM", description:"Select new location mode", constraints: AVAILABLE_MODES ]
        ]
        attribute "mode", "string"
    }   
}

def installed() {
    log.debug "Virtual Mode Selector installed."
}

def updated() {
    log.debug "Virtual Mode Selector updated."
}

def on() {
    log.debug "on() called – please use the setMode command with your desired mode."
}

def off() {
    log.debug "off() called – no action taken."
}

/**
 * setMode command that accepts a new mode from the built-in static drop-down selector.
 */
def setMode(String newMode) {
    log.debug "Attempting to set location mode to '${newMode}'"
    try {
        location.setMode(newMode)
        sendEvent(name: "mode", value: newMode)
        log.debug "Location mode successfully set to '${newMode}'"
    } catch (Exception e) {
        log.error "Error setting location mode to '${newMode}': ${e}"
    }
}

def refresh() {
    log.debug "Refreshing – current location mode: ${location.mode}"
    sendEvent(name: "mode", value: location.mode)
}
/**
 *  Copyright 2025 Megamind
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *  
 *    Virtual Mode Selector
 *    Created for Use with Home Assistant to Select Modes.  
 * 
 *   Date            Description
 *   -------------   -----------------------------------------------------------------------------
 *   04-07-2025      0.1.0 Initial Alpha Driver
 *
 * LINE 30 MAX 
 */

public static String version() {return "0.1.0"}

// Define a constant list of available modes. Update this list to add or remove modes.
def AVAILABLE_MODES = ["Home", "Away", "Night", "Guest", "Vacation"]

metadata {
    definition(name: "Virtual Mode Selector", namespace: "yourNamespace", author: "Your Name") {
        capability "Actuator"
        capability "Refresh"
        // Use the constant for the command parameter's constraints.
        command "setMode", [
            [ name:"newMode", type:"ENUM", description:"Select new location mode", constraints: AVAILABLE_MODES ]
        ]
        attribute "mode", "string"
    }   
}

def installed() {
    log.debug "Virtual Mode Selector installed."
}

def updated() {
    log.debug "Virtual Mode Selector updated."
}

def on() {
    log.debug "on() called – please use the setMode command with your desired mode."
}

def off() {
    log.debug "off() called – no action taken."
}

/**
 * setMode command that accepts a new mode from the built-in static drop-down selector.
 */
def setMode(String newMode) {
    log.debug "Attempting to set location mode to '${newMode}'"
    try {
        location.setMode(newMode)
        sendEvent(name: "mode", value: newMode)
        log.debug "Location mode successfully set to '${newMode}'"
    } catch (Exception e) {
        log.error "Error setting location mode to '${newMode}': ${e}"
    }
}

def refresh() {
    log.debug "Refreshing – current location mode: ${location.mode}"
    sendEvent(name: "mode", value: location.mode)
}
