/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.types;

import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link CommandDescription} groups state command properties.
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
public interface CommandDescription {

    /**
     * An unmodifiable list of {@link CommandOption}s.
     *
     * @return An unmodifiable list of {@link CommandOption}s
     */
    List<CommandOption> getCommandOptions();
}
