package pages

import models.whatIsYourName
import pages.behaviours.PageBehaviours

class whatIsYourNamePageSpec extends PageBehaviours {

  "whatIsYourNamePage" - {

    beRetrievable[whatIsYourName](whatIsYourNamePage)

    beSettable[whatIsYourName](whatIsYourNamePage)

    beRemovable[whatIsYourName](whatIsYourNamePage)
  }
}
