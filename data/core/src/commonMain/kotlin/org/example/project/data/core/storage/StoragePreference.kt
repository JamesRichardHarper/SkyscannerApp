package org.example.project.data.core.storage

import org.example.project.data.core.iTemplates.BaseKey
import org.example.project.data.core.iTemplates.Readable
import org.example.project.data.core.iTemplates.StorageKey
import org.example.project.data.core.iTemplates.Writable

interface StoragePreference: Readable, Writable, StorageKey {
}