package ua.opnu.mobile.lab1

import org.junit.Test

import org.junit.Assert.*


class ExampleUnitTest {

    @Test
    fun sleepIn() {
        assertEquals(true, sleepIn(false, false))
        assertEquals(false, sleepIn(true, false))
        assertEquals(true, sleepIn(false, true))
        assertEquals(true, sleepIn(true, true))
    }

    @Test
    fun parrotTrouble() {
        assertEquals(true, parrotTrouble(true, 6))
        assertEquals(false, parrotTrouble(true, 7))
        assertEquals(false, parrotTrouble(false, 6))
        assertEquals(true, parrotTrouble(true, 21))
        assertEquals(false, parrotTrouble(false, 21))
        assertEquals(false, parrotTrouble(false, 20))
        assertEquals(true, parrotTrouble(true, 23))
        assertEquals(false, parrotTrouble(false, 23))
        assertEquals(false, parrotTrouble(true, 20))
        assertEquals(false, parrotTrouble(false, 12))
    }
}