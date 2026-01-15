#### **MANUAL TEST CASE REPORT**

===========================================



##### **Travel Booking Platform**

-----------------------------------------





###### **Test Case: Verify Add New Booking**



|Field           | Description                                        |

|----------------|----------------------------------------------------|

|Test Case Id    |  TC\_TBP\_01                                         |

|Test Case Title |  Verify new travel booking can be added            |

|Module Name     |  Booking Module                                    |

|Precondition    |  1. User logged in                                 |

|                |  2. Booking module accessible                      |

|Test Steps      |  1. Navigate to Add Booking screen                 |

|                |  2. Enter travel details                           |

|                |  3. Click Save                                     |

|Test Data       |  Destination = "Paris"                             |

|                |  Travel Date = "20/01/2026"                        |

|                |  Passenger Name = "Alex Smith"                     |

|                |  Booking ID = "B001"                               |

|Expected Result |  Booking record should be created successfully     |

|Actual Result   |  Booking record created                            |

|Status          |  Pass / Fail                                       |

|Remarks         |  Ensure unique Booking ID is enforced              |







###### **Test Case: Verify Search Booking**



|Field            | Description                             |

|-----------------|-----------------------------------------|

|Test Case Id     | TC\_TBP\_02                               |

|Test Case Title  | Verify search by booking ID             |

|Module Name      | Booking Module                          |

|Precondition     | Booking record exists                   |

|Test Steps       | 1. Navigate to Search Booking           |

|                 | 2. Enter Booking ID                     |

|                 | 3. Click Search                         |

|Test Data        | Booking ID = "B001"                     |

|Expected Result  | Booking details should be displayed     |

|Actual Result    | Booking details displayed               |

|Status           | Pass / Fail                             |

|Remarks          | Ensure search works for valid IDs       |

