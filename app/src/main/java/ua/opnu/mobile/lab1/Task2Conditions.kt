package ua.opnu.mobile.lab1

// TODO: Параметр weekday має значення true, якщо це будній день,
//  а параметр vacation має значення true, якщо ми у відпустці.
//  Ми спимо, якщо це не будній день або ми у відпустці.
//  Повертаємо true, якщо ми спимо.
//  Приклад:
//  sleepIn(false, false) → true
//  sleepIn(true, false) → false
//  sleepIn(false, true) → true
fun sleepIn(weekday: Boolean, vacation: Boolean): Boolean {
    return false
}

// TODO: У нас є папуга, який голосно розмовляє. Параметр "hour" - це поточна година
//  в діапазоні 0..23. Якщо папуга розмовляє, а година до 7 або після 20, то у нас проблеми.
//  Поверніть true, якщо ми в біді.
//  Приклад:
//  parrotTrouble(true, 6) → true
//  parrotTrouble(true, 7) → false
//  parrotTrouble(false, 6) → false
fun parrotTrouble(talking: Boolean, hour: Int): Boolean {
    return false
}
